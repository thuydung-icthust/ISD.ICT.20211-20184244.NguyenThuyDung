package controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author Nguyen Thuy Dung
 * @version 1.0
 * <p>
 * created_at: 07/12/2021
 * <p>
 * project_name: An Internet Media Store (AIMS)
 * <p>
 * teacher_name: Dr. Nguyen Thi Thu Trang
 * <p>
 * class_name: ICT 01.K63
 * <p>
 * helpers: Teaching Assistants 
 * 
 */
public class PlaceOrderControllerTest {
	  private PlaceOrderController placeOrderController;

	    @BeforeEach
	    void setUp() throws Exception {
	        placeOrderController = new PlaceOrderController();
	    }


	    @ParameterizedTest
	    @CsvSource({
	            "hanoi,true",
	            "so 15 hai ba trung,true",
	            "$# Hanoi,false",
	            ",false"
	    })
	    public void testAddress1(String address, boolean expected) {
	        boolean isValid = placeOrderController.validateAddress(address);
	        assertEquals(expected,isValid);
	    }


	    @Test
	    public void testAddress2() {
	        boolean isValid = placeOrderController.validateAddress("so 15, hai ba trung");
	        assertEquals(true,isValid);
	    }
	    
	    @ParameterizedTest
	    @CsvSource({
	            "nguyenlm,true",
	            "nguyen01234,false",
	            "$#nguyen,false",
	            ",false"
	    })
	    public void testName(String name, boolean expected) {
	        boolean isValid = placeOrderController.validateName(name);
	        assertEquals(expected,isValid);
	    }
	    
		
		@ParameterizedTest
		@CsvSource({
			"0123456789,true",
			"01234,false",
			"abc123,false",
			",false"
		})
		public void testPhoneNumber(String phone, boolean expected) {
			boolean isValid = placeOrderController.validatePhoneNumber(phone);
			assertEquals(expected,isValid);
		}
}
