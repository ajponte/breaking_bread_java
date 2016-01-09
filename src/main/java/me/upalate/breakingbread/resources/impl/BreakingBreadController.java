package me.upalate.breakingbread.resources.impl;

import me.upalate.breakingbread.dto.Event;
import me.upalate.breakingbread.dto.EventContainer;
import me.upalate.breakingbread.resources.BreakingBreadResource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

/**
 * HTTP endpoints for the BreakingBread service.
 */
public class BreakingBreadController implements BreakingBreadResource {

   @Override
   public EventContainer getEvent(@RequestParam(value = "event_id", required = true) Long eventId) {
      //TODO
      return new EventContainer();
   }

   @Override
   public void addEvent(@Valid @RequestBody(required = true) Event eventInfo) {
      //TODO
   }

   @Override
   public void updateEvent(@Valid @RequestBody(required = true) Event oldEventInfo, Event newEventInto) {
      //TODO
   }
}
