import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by nicksimard on 16-04-06.
 */
public class MyCustomTextView extends TextView{



    public MyCustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/Montsterrat-Regular.ttf"));
    }
}
