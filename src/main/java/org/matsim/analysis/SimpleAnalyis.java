package org.matsim.analysis;

import org.matsim.core.events.EventsUtils;

public class SimpleAnalyis {

    public static void main(String[] args){

        var handler = new SimplePersonEventHandler();
        var manager = EventsUtils.createEventsManager();
        manager.addHandler(handler);

        EventsUtils.readEvents(manager, "C:\\Users\\flori\\Desktop\\05_MATSim\\Serengeti Park Hodenhagen\\scenarios\\serengeti-park-v1.0\\output\\output-serengeti-park-v1.0-run1\\serengeti-park-v1.0-run1.output_events.xml.gz");
    }
}
