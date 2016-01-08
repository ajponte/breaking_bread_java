package me.upalate.breakingbread.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class Event {

   /**
    * The userId of the user who owns the event.
    */
   @NotNull
   private final long userId;

   @NotNull
   private final long timestamp;

   /**
    * The name of the event.
    */
   @NotNull
   private final String name;

   /**
    * The location of the event.
    */
   @NotNull
   private EventLocation location;

   public Event(@JsonProperty("userId") Long userId,
                @JsonProperty("timestamp") Long timestamp,
                @JsonProperty("name") String name,
                @JsonProperty("location") EventLocation location) {
      this.userId = userId;
      this.timestamp = timestamp;
      this.name = name;
      this.location = location;

   }
}
