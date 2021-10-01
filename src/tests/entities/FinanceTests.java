package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinanceTests {

	@Test
	public void constructorMustCreateObjectsWhenCorrectDataIsValid() {
		// arrange

		// action
		Financing financing = new Financing(100000.0, 2000.0, 80);

		// assert
		Assertions.assertEquals(100000.00, financing.getTotalAmount());
		Assertions.assertEquals(2000.0, financing.getIncome());
		Assertions.assertEquals(80, financing.getMonths());
	}

	@Test
	public void constructorMustThrowIllegalArgumentExceptionWhenDataNotValid() {
		// arrange

		// action

		// assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = new Financing(100000.0, 2000.0, 20);
		});

	}

	@Test
	public void setTotalAmountMustUpdateValueWhenCorrectDataIsValid() {
		// arrange
		Financing financing = new Financing(100000.0, 2000.0, 80);

		// action
		financing.setTotalAmount(90000.0);

		// assert
		Assertions.assertEquals(90000.00, financing.getTotalAmount());

	}

	@Test
	public void setTotalAmountMustThrowIllegalArgumentExceptionWhenDataNotValid() {
		// assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			// arrange
			Financing financing = new Financing(100000.0, 2000.0, 80);

			// action
			financing.setTotalAmount(110000.0);
			;
		});

	}

	@Test
	public void setIncomeMustUpdateValueWhenCorrectDataIsValid() {
		// arrange
		Financing financing = new Financing(100000.0, 2000.0, 80);

		// action
		financing.setIncome(2100.0);

		// assert
		Assertions.assertEquals(2100.0, financing.getIncome());

	}

	@Test
	public void setIncomeAmountMustThrowIllegalArgumentExceptionWhenDataNotValid() {
		// assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			// arrange
			Financing financing = new Financing(100000.0, 2000.0, 80);

			// action
			financing.setIncome(1950.0);
			;
		});

	}

	@Test
	public void setMonthsMustUpdateValueWhenCorrectDataIsValid() {
		// arrange
		Financing financing = new Financing(100000.0, 2000.0, 80);

		// action
		financing.setMonths(81);

		// assert
		Assertions.assertEquals(81, financing.getMonths());

	}

	@Test
	public void setMonthsAmountMustThrowIllegalArgumentExceptionWhenDataNotValid() {
		// assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			// arrange
			Financing financing = new Financing(100000.0, 2000.0, 80);

			// action
			financing.setMonths(79);
			;
		});

	}

	public void entryMustCalculateEntryCorrectly() {

		double expectable = 20000.0;
		Financing financing = new Financing(100000.0, 2000.0, 80);

		Assertions.assertEquals(expectable, financing.entry());
	}

	public void quotaMustCalculateQuotaAmountCorrectly() {

		double expectable = 1000.0;
		Financing financing = new Financing(100000.0, 2000.0, 80);

		Assertions.assertEquals(expectable, financing.quota());
	}

}
