package ua.org.oa.examples.home_work_4;

import java.util.ArrayList;

/**
 * общий класс для все камер, объявлен как абстрактный - чтобы нельзя было его
 * создать
 */
public abstract class Foto {
	/** название камеры */
	private String brandName;
	/** цена */
	private float price;
	/** размер кадра */
	private String imageSize;
	/** всепогодность камеры */
	private boolean allWeather;
	/** максимальная чувствительность */
	private int maxIso;
	/** кол-во мегапикселей */
	private int countMpx;
	/** лист для хранения всех камер */
	static ArrayList<Foto> myFoto = new ArrayList<Foto>();

	// конструкторы
	public Foto() {
	}

	public Foto(String brandName, float price, String imageSize,
				boolean allWeather, int maxIso, int countMpx) {
		this.brandName = brandName;
		this.price = price;
		this.imageSize = imageSize;
		this.allWeather = allWeather;
		this.maxIso = maxIso;
		this.countMpx = countMpx;
	}

	// геттеры и сеттеры для переменных
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getImageSize() {
		return imageSize;
	}

	public void setImageSize(String imageSize) {
		this.imageSize = imageSize;
	}

	public boolean getAllWeather() {
		return allWeather;
	}

	public void setAllWeather(boolean allWeather) {
		this.allWeather = allWeather;
	}

	public int getMaxIso() {
		return maxIso;
	}

	public void setMaxIso(int maxIso) {
		this.maxIso = maxIso;
	}

	public int getCountMpx() {
		return countMpx;
	}

	public void setCountMpx(int countMpx) {
		this.countMpx = countMpx;
	}

	/** метод будет переопределен в наследниках, выводит инфо о камере */
	public void showCamera() {
	}

	/** метод выводящий все камеры из листа */
	public static void showAllCamera() {
		for (Foto el : myFoto) {
			el.showCamera();
		}

	}

	/** метод выводящий инфо общую для всех типов камер */
	public void showBasicInfo() {
		System.out.println("------------------------");
		System.out.println("Название: " + getBrandName());
		System.out.println("Цена: " + getPrice() + " грн.");
		System.out.println("Размер кадра: " + getImageSize());
		System.out
				.println("Количество мегапикселей: " + getCountMpx() + " mpx");
		System.out.println("Максимальная чувствительность: " + getMaxIso()
				+ " iso");
		System.out.println("Защита от влаги и пыли: "
				+ (getAllWeather() ? "Да" : "Нет"));
	}

	/** добавление камеры в лист */
	public static void addFoto(Foto addingFoto) {
		myFoto.add(addingFoto);
	}

	/**
	 * метод выводящий камеры у которых количеств мегапикселей больш заданного
	 * значения
	 */
	public static void showMoreMpx(int inputCountMpx) {
		System.out
				.println("Фотоаппараты у которых количество мегапикселей больше "
						+ inputCountMpx);
		System.out
				.println("-------------------------------------------------------");
		for (Foto el : myFoto) {
			if (el.getCountMpx() > inputCountMpx) {
				el.showCamera();
			}
		}
	}

	/** метод выводящий полнокадровые камеры */
	public static void showFullFrameCamera() {
		System.out.println("Фотоаппараты полнокадровые:");
		System.out
				.println("-------------------------------------------------------");
		for (Foto el : myFoto) {
			if (el.getImageSize() == "fullframe") {
				el.showCamera();
			}
		}
	}

	/** метод выводящий камеры со сменой оптикой в заданном ценовом диапазоне */
	public static void showCameraWithLensesAndPrice(float minInputPrice,
													float maxInputPrice) {
		System.out.println("Фотоаппараты со сменной оптикой и ценой больше :"
				+ minInputPrice + " и меньше " + maxInputPrice);
		System.out
				.println("-------------------------------------------------------");
		for (Foto el : myFoto) {
			if ((el.getPrice() > minInputPrice)
					&& (el.getPrice() < maxInputPrice)
					&& (el instanceof DigitalWithLenses)) {
				el.showCamera();
			}
		}
	}

}
