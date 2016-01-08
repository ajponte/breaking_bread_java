package me.upalate.breakingbread.resources;

import me.upalate.breakingbread.dto.Event;
import me.upalate.breakingbread.dto.EventContainer;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;

/**
 * Interface to the BreakingBread service.
 */
@RequestMapping("/v1")
public interface BreakingBreadResource {

   /**
    * Returns the Event mapped by its ID.
    *
    * @param eventId The ID mapped to a particular event.
    * @return All event info mapped by the ID.
    */
   @RequestMapping(value = "/events",
                   method = RequestMethod.GET,
                   produces = MediaType.APPLICATION_JSON_VALUE)
   @ResponseBody
   EventContainer getEvent(@RequestParam(value = "event_id", required = true) Long eventId);

   /**
    * Creates a new Event.
    *
    * @param eventInfo The information about the Event.
    */
   @RequestMapping(value = "/events",
                   method = RequestMethod.POST,
                   consumes = MediaType.APPLICATION_JSON_VALUE)
   @ResponseStatus(value = HttpStatus.CREATED)
   @ResponseBody
   void addEvent(@Valid @RequestBody(required = true) Event eventInfo);

   @ResponseStatus(value = HttpStatus.CREATED)
   @RequestMapping(value = "/events",
                   method = RequestMethod.PUT,
                   consumes = MediaType.APPLICATION_JSON_VALUE)
   @ResponseBody
   void updateEvent(@RequestBody(required = true) Event oldEventInfo, Event newEventInfo);
}
