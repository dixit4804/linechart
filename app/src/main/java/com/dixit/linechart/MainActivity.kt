package com.dixit.linechart

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet

class MainActivity : AppCompatActivity() {

    private lateinit var lineChart: LineChart

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the LineChart
        lineChart = findViewById(R.id.lineChart)

        // Example data points for the chart
        val entries = mutableListOf<Entry>()
        entries.add(Entry(0f, 2f))
        entries.add(Entry(1f, 4f))
        entries.add(Entry(2f, 6f))
        entries.add(Entry(3f, 8f))

        // Create the dataset for the chart
        val lineDataSet = LineDataSet(entries, "Sample Data")
        lineDataSet.color = Color.BLUE
        lineDataSet.valueTextColor = Color.BLACK

        // Create LineData object with dataset
        val lineData = LineData(lineDataSet)

        // Set data to the LineChart
        lineChart.data = lineData

        // Refresh the chart
        lineChart.invalidate()
    }
}
