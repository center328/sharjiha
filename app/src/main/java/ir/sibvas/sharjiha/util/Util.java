package ir.sibvas.sharjiha.util;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class Util {

    /*public static String getPrice(Context context, Product product){
        return NumberFormat.getNumberInstance(Locale.US).format(product.price);
        //+ " " +
          //      context.getString(R.string.tooman);
    }*/

    public static String getPrice(Context context, long price){
        return NumberFormat.getNumberInstance(Locale.US).format(price);
        //+ " " +
        //      context.getString(R.string.tooman);
    }
    public static String getPrice(Context context, int price){
        return NumberFormat.getNumberInstance(Locale.US).format(price);
        //+ " " +
        //      context.getString(R.string.tooman);
    }

    /*public static String getPriceWithTooman(Context context, Product product){
        return getPrice(context, product)
        + " " +
              context.getString(R.string.tooman);
    }*/

    public static String getStringOfIdListWithCamma(ArrayList<Integer> listId){

        String ids = "";
        for(int i = 0; i < listId.size(); i++){
            if((i + 1) < listId.size()){
                ids += String.valueOf(listId.get(i)) + ",";
            } else {
                ids += String.valueOf(listId.get(i));
            }
        }
        return ids;
    }

    /*public static List<EducationLevel> getEducationLevels(){

        EducationLevel level1 = new EducationLevel();
        level1.id = EducationLevel.EDUCATION_TYPE_CYCLE;
        level1.title = "زیردیپلم";

        EducationLevel level2 = new EducationLevel();
        level2.id = EducationLevel.EDUCATION_TYPE_DIPLOMA;
        level2.title = "دیپلم";

        EducationLevel level3 = new EducationLevel();
        level3.id = EducationLevel.EDUCATION_TYPE_ILLITERATE;
        level3.title = "کاردانی";

        EducationLevel level4 = new EducationLevel();
        level4.id = EducationLevel.EDUCATION_TYPE_MASTERS;
        level4.title = "کارشناسی";

        EducationLevel level5 = new EducationLevel();
        level5.id = EducationLevel.EDUCATION_TYPE_MASTER_BA;
        level5.title = "ارشد";

        EducationLevel level6 = new EducationLevel();
        level6.id = EducationLevel.EDUCATION_TYPE_PHD;
        level6.title = "دکتری";

        EducationLevel level = new EducationLevel();
        level.title = "مدرک تحصیلی";

        List<EducationLevel> lst = new ArrayList<>();
        lst.add(level);
        lst.add(level1);
        lst.add(level2);
        lst.add(level3);
        lst.add(level4);
        lst.add(level5);
        lst.add(level6);

        return lst;
    }*/

    /*public static void initRateChart(Context context, HorizontalBarChartView rateChart){

        BarSet barSet = new BarSet();

        Bar start1 = new Bar("★", 0.5f);
        start1.setColor(ContextCompat.getColor(context, R.color.star_1));
        barSet.addBar(start1);

        Bar start2 = new Bar("★★", 3f);
        start2.setColor(ContextCompat.getColor(context, R.color.star_2));
        barSet.addBar(start2);

        Bar start3 = new Bar("★★★", 2.2f);
        start3.setColor(ContextCompat.getColor(context, R.color.star_3));
        barSet.addBar(start3);

        Bar start4 = new Bar("★★★★", 3.5f);
        start4.setColor(ContextCompat.getColor(context, R.color.star_4));
        barSet.addBar(start4);

        Bar start5 = new Bar("★★★★★", 4.3f);
        start5.setColor(ContextCompat.getColor(context, R.color.star_5));
        barSet.addBar(start5);


        rateChart.addData(barSet);
        rateChart.setXAxis(false);
        rateChart.setYAxis(false);
        rateChart.setAxisBorderValues(0, 5);
        rateChart.setXLabels(AxisController.LabelPosition.NONE);
        rateChart.setLabelsColor(ContextCompat.getColor(context, R.color.text_color_secondry));


//        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Reqular.ttf");
//        rateChart.setTypeface(typeface);
//        rateChart.setYLabels(AxisController.LabelPosition.NONE);
    }*/


    public static void hideKeyboard(AppCompatActivity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Find the currently focused view, so we can grab the correct window token from it.
        View view = activity.getCurrentFocus();
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if(view == null) {
            view = new View(activity);
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static LocalDateTime stringToDateTime(String dateTime){
        DateTimeFormatter formatter = DateTimeFormat.forPattern(Constant.DATETIME_PATTERN);
        return !dateTime.equals("") ? LocalDateTime.parse(dateTime, formatter) : null;
    }

    public static String dateTimeToString(LocalDateTime localDateTime){
        return localDateTime.toString(Constant.DATETIME_PATTERN);
    }

    public static String dateToString(LocalDate localDate){
        return localDate.toString(Constant.DATE_PATTERN);
    }


    public static LocalDate stringToDate(String date) {
        DateTimeFormatter formatter = DateTimeFormat.forPattern(Constant.DATE_PATTERN);
        return !date.equals("") ? LocalDate.parse(date, formatter) : null;
    }
}
