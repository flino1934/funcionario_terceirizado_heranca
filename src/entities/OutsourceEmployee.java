package entities;

public final class OutsourceEmployee extends Employee {

	private Double additionalCharge;

	public OutsourceEmployee() {

	}

	public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {

		super(name, hours, valuePerHour);// Chamou o contrutor da superclasse
		this.additionalCharge = additionalCharge;

	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public Double payment() {

		return super.payment() + additionalCharge * 1.1;

	}

}
