package ua.org.oa.examples.home_work_4;

/**
 * абстрактный класс камер со сменной оптикой, т.к. не может быть создан - имеет
 * специфических наследников
 */
public abstract class DigitalWithLenses extends Foto {
	/** тип байонета (крепления объектива), общая переменная для наследников */
	private String lensMountType;

	// конструкторы
	public DigitalWithLenses() {
	}

	public DigitalWithLenses(String brandName, float price, String imageSize,
							 boolean allWeather, int maxIso, int countMpx, String lensMountType) {
		super(brandName, price, imageSize, allWeather, maxIso, countMpx);
		this.lensMountType = lensMountType;
	}

	// геттеры и сеттеры
	public String getLensMountType() {
		return lensMountType;
	}

	public void setLensMountType(String lensMountType) {
		this.lensMountType = lensMountType;
	}

	// переопределенный метод вывода инфы о камере
	@Override
	public void showCamera() {
		super.showBasicInfo();
		System.out.println(getLensMountType());
	}

}
