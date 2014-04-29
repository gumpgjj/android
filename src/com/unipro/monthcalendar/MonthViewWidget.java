package com.unipro.monthcalendar;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;


public class MonthViewWidget extends AppWidgetProvider{
	   
		@Override
		public void onUpdate(Context context,
				AppWidgetManager appWidgetManager, int[] appWidgetIds) {
			super.onUpdate(context, appWidgetManager, appWidgetIds);
		}
		
		@Override
		public void onDeleted(Context context, int[] appWidgetIds) {
			context.stopService(new Intent(context, MonthViewWidgetService.class));
			super.onDeleted(context, appWidgetIds);
		}

		@Override
		public void onEnabled(Context context) {
			context.startService(new Intent(context, MonthViewWidgetService.class));
			super.onEnabled(context);
		}

		@Override
		public void onDisabled(Context context) {
			context.stopService(new Intent(context, MonthViewWidgetService.class));
			super.onDisabled(context);
		}
		
		
}
