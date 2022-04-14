import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commissionCalc_Vk_Pay() {
        val result = commissionCalc(3, 10000, 0)

        assertEquals(0.0, result, 0.01)
    }
    @Test
    fun commissionCalc_Visa_Mir() {
        val result = commissionCalc(2, 10000,0)

        assertEquals(110.0, result, 0.01)
    }
    @Test
    fun commissionCalc_Mastercard_Maestro_Zero_Previous() {
        val result = commissionCalc(1, 10000,0)

        assertEquals(80.0, result, 0.01)
    }
    @Test
    fun commissionCalc_Mastercard_Maestro_Low_Prev() {
        val result = commissionCalc(1, 10000,300)

        assertEquals(0.0, result, 0.01)
    }
    @Test
    fun commissionCalc_Mastercard_Maestro_In_Range() {
        val result = commissionCalc(1, 10000,350)

        assertEquals(0.0, result, 0.01)
    }
    @Test
    fun commissionCalc_Mastercard_Maestro_High_Prev() {
        val result = commissionCalc(1, 10000,75000)

        assertEquals(0.0, result, 0.01)
    }
    @Test
    fun commissionCalc_Mastercard_Maestro_Out_Of_Prev() {
        val result = commissionCalc(1, 10000,76000)

        assertEquals(80.0, result, 0.01)
    }
}
