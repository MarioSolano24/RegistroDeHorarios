package com.example.estudiante

/*import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

class Employee (val int:Int,
                val fullName:String,
                val academicDegree:String,
                val curp: String,
                val dateOfAdmission:LocalDate,
                val gender:String,){

@RequiresApi(Build.VERSION_CODES.O)
val  toRegister= listOf(Employee(1,"mario","universitario","socm970909hoclrr00",LocalDate.parse("2022-09-08"),"masculino"))
}*/
import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

data class Employee (
    val id: Long,
    val fullName:String,
    val academicLevel: AcademicLevel,
    val curp:String,
    val dateOfAdmission: LocalDate,
    val budgetKey: String
){
    @RequiresApi(Build.VERSION_CODES.O)
    fun getSeniority():Int{
        val currentYear = LocalDate.now().year
        val currentMonth = LocalDate.now().monthValue
        val currentDay = LocalDate.now().dayOfMonth
        val yearOfAdmission = dateOfAdmission.year
        val monthOfAdmission = dateOfAdmission.monthValue
        val dayOfAdmission = dateOfAdmission.dayOfMonth
        val year = currentYear - yearOfAdmission
        return (if (currentMonth<monthOfAdmission ||
            (currentMonth==monthOfAdmission && currentDay<dayOfAdmission ))
            year - 1
        else
            year)
    }
    fun getGenre()=curp.substring(10,11)


}
