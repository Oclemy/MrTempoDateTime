package info.camposha.mr_tempo_datetime

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.cesarferreira.tempo.*
import info.camposha.mr_tempo_datetime.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private fun createDateExamples(): List<String> {
        val examples = listOf(
            "------   GET DATE,TIME   ----",
            "NOW: ${Tempo.now}",
            "INITIALIZATION: ${Tempo.with(year = 1990, month = 1, day = 21)}",
            "INITIALIZATION: ${Tempo.now.with(month = 12, day = 25)}",
            "",
            "-------  USER FRIENDLY READABLE DATES   -------",
            "TOMORROW: ${Tempo.tomorrow}",
            "YESTERDAY: ${Tempo.yesterday}",
            "",
            "-------  ADD OR SUBTRACT DATES   --------",
            "1 WEEK FROM NOW: " + (Tempo.now.plus(1.week)),
            "1 WEEK AGO: " + Tempo.now.minus(1.week),
            "2 DAYS AGO: " + Tempo.now.minus(2.days),
            "",
            "------   TIME AGO  ---------",
            "A DAY AGO: ${1.day.ago}",
            "3 WEEKS AGO: ${3.weeks.ago}",
            "5 YEARS FORWARD: ${5.years.forward}",
            "",
            "-------  SHORTCUTS   -----",
            "NEW YEAR: ${Tempo.now.beginningOfYear}",
            "END OF YEAR: ${Tempo.now.endOfYear}",
            "----CHECK DATE-----",
            "IS MONDAY: ${Tempo.now.isMonday}",
            "IS TUESDAY: ${Tempo.now.isTuesday}",
            "IS WEDNESDAY: ${Tempo.now.isWednesday}",
            "IS THURSDAY: ${Tempo.now.isThursday}",
            "IS FRIDAY: ${Tempo.now.isFriday}",
            "IS SATURDAY: ${Tempo.now.isSaturday}",
            "IS SUNDAY: ${Tempo.now.isSunday}",
            "IS WEEKEND: ${Tempo.now.isWeekend}",
            "IS WEEKDAY: ${Tempo.now.isWeekday}",
            "",
            "------  FORMAT AND PARSE  ------",
            "${5.minutes.forward.toString("yyyy-MM-dd HH:mm:ss")}",
            "${"1988-03-02".toDate("yyyy-MM-dd")}",
            "",
            "------  COMPARE  -------",
            "${1.day.ago > 2.days.ago}",
            "${1.day.ago in 2.days.ago..Tempo.now}"

        )
        return examples
    }

    private fun populateListView(data: List<String>) {
        binding.listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, data)
        binding.listView.setOnItemClickListener { _, _, i, _ ->
            Toast.makeText(this@MainActivity,data[i],Toast.LENGTH_SHORT).show()
         }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        populateListView(createDateExamples())
    }
}
