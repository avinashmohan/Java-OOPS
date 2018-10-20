package EarthQuakeCityMap;

import java.util.ArrayList;
import java.util.List;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

public class EarthQuakeCityMap extends PApplet {
	
	private UnfoldingMap map;
	
	public void setup()
	{
		size(950,600,OPENGL);
		map=new UnfoldingMap(this,200,50,700,500,new Google.GoogleMapProvider());
		map.zoomToLevel(2);
	/*	Location valLoc= new Location(-38.14f,-73.03f);
		
		Feature valEq=new PointFeature(valLoc);
		valEq.addProperty("title", "Valdivia Chile");
		valEq.addProperty("magnitude", "9.5");
		valEq.addProperty("date", "May 22,1950");
		valEq.addProperty("year", "1960");
		SimplePointMarker val=new SimplePointMarker(valLoc,valEq.getProperties());
		map.addMarker(val);
		*/
		List<PointFeature> bigEqs=new ArrayList<PointFeature>();
		List<Marker> markers=new ArrayList<Marker>();
		
		int yellow=color(255,255,0);
		int grey=color(150,150,150);
		
		for (Marker mk: markers)
		{
			if ((int) mk.getProperty("year")>2000)
			{
				mk.setColor(yellow);
			}
			else
			{
				mk.setColor(grey);
			}
		}
		
		//MapUtils.createDefaultEventDispatcher(this, map);
		
	}
	
	public void draw()
	{
		background(10);
		map.draw();
		//addkey();
		
	}

}
