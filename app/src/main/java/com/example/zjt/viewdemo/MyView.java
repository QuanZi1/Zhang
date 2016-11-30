package com.example.zjt.viewdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.example.zjt.viewdemo.bean.PieData;

import java.util.ArrayList;

/**
 * Created by 三岁 on 2016/11/30.
 */

public class MyView extends View {

    private int mwidth;
    private int mheight;
    private int length=0;
    private ArrayList<PieData> pieDatas;
    private RectF rectF;
    private Paint paint;
    private int mStartAngle;
    private int[] mColors={0xFFCCFF00, 0xFF6495ED, 0xFFE32636, 0xFF800000, 0xFF808000, 0xFFFF8C69, 0xFF808080, 0xFFE6B800, 0xFF7CFC00};

    public MyView(Context context) {
        this(context,null);
    }

    public MyView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {

        //图片位置
        rectF = new RectF(100, 100, 500, 500);
        //画笔
        paint = new Paint();
        paint.setColor(Color.BLACK);
        
    }

    //测量
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    }

    //布局位置
    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);

    }

    //画布
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        for (int i = 0; i < pieDatas.size() ; i++) {
//
//            canvas.drawArc(rectF,pieDatas.get(i).getPercentage(),pieDatas.get(i).getAngle(),true,paint);
//            mStartAngle+=40;
//            paint.setColor(mColor[i]);
//
//        }
       // canvas.drawColor(Color.);


        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.FILL);
        RectF rectF = new RectF(100, 100, 200, 200);

        for (int i = 0; i < mColors.length; i++) {

            canvas.drawArc(rectF, length, 40, true, paint);
            length=length+40;
            paint.setColor(mColors[i]);
        }

        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(rectF,paint);
    }

//    @Override
//    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
//        super.onSizeChanged(w, h, oldw, oldh);
//        mwidth=w;
//        mheight=h;
//}

//    public void setPieDatas(ArrayList<PieData> pieDatas){
//        this.pieDatas=pieDatas;
//    }

}