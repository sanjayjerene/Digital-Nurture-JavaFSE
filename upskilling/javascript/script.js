console.log("Welcome to the Community Portal");

window.onload = function () {
    alert("Community Portal page has fully loaded!");
};
function showMessage() {
      console.log("Registration Form Submitted");

      document.getElementById("confirmation").innerHTML =
        "Registration Successful";
    }

function validatePhone() {
      let phone = document.getElementById("phone").value;

      console.log("Phone Entered:", phone);

      let msg = document.getElementById("phoneMsg");

      if (/^[0-9]{10}$/.test(phone)) {
        msg.innerHTML = "Valid Phone Number";
        msg.style.color = "green";
      } else {
        msg.innerHTML = "Enter a valid 10-digit phone number";
        msg.style.color = "red";
      }
    }

    function showFee() {
      let fee = document.getElementById("eventSelect").value;

      if (fee !== "") {
        document.getElementById("feeDisplay").innerHTML = "Event Fee: ₹" + fee;
      }
    }

    function showFeeAndImage() {
      let select = document.getElementById("eventSelect");
      let fee = select.value;
      let eventName = select.options[select.selectedIndex].text;

      document.getElementById("feeDisplay").innerHTML = "Event Fee: ₹" + fee;

      let img = document.getElementById("eventImage");

      switch (eventName) {
        case "Music Festival":
          img.src = "music_concert.jpeg";
          break;

        case "Food Fair":
          img.src = "food_fest.jpeg";
          break;

        case "Sports Day":
          img.src = "sports_day.jpeg";
          break;

        case "Health Camp":
          img.src = "health_care.jpeg";
          break;

        case "Cultural Night":
          img.src = "night_cult.jpeg";
          break;

        default:
          img.src = "music_concert.jpeg";
      }
    }

    function enlargeImage() {
      let img = document.getElementById("eventImage");

      if (img.style.width === "450px") img.style.width = "250px";
      else img.style.width = "450px";
    }

    function submitFeedback() {
      document.getElementById("confirmMsg").innerHTML =
        "Feedback Submitted Successfully!";
      document.getElementById("confirmMsg").style.color = "green";
    }

    function enlargeImage() {
      let img = document.getElementById("eventImage");

      if (img.style.width === "400px") {
        img.style.width = "200px";
      } else {
        img.style.width = "400px";
      }
    }

    function countChars() {
      let count = document.getElementById("feedbackText").value.length;
      document.getElementById("charCount").innerHTML = count;
    }

    function videoReady() {
      document.getElementById("videoMsg").innerHTML = "✅ Video ready to play";
    }

    window.onbeforeunload = function () {
      let name = document.getElementById("name").value;
      let phone = document.getElementById("phone").value;
      let feedback = document.getElementById("feedbackText").value;

      if (name || phone || feedback) {
        return "You have unfinished form data.";
      }
    };
    function savePreference() {
    let selectedEvent =
        document.getElementById("preferredEvent").value;

    localStorage.setItem(
        "preferredEvent",
        selectedEvent
    );
}

window.onload = function () {

    let savedEvent =
        localStorage.getItem("preferredEvent");

    if (savedEvent) {
        document.getElementById(
            "preferredEvent"
        ).value = savedEvent;
    }

    sessionStorage.setItem(
    "lastVisit",
    new Date()
);
};
function clearPreferences() {

    localStorage.clear();

    sessionStorage.clear();

    alert(
        "Preferences cleared successfully!"
    );

    document.getElementById(
        "preferredEvent"
    ).value = "";
}
function findLocation() {
      if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(
          showPosition,

          showError,

          {
            enableHighAccuracy: true,
            timeout: 10000,
            maximumAge: 0,
          },
        );
      } else {
        document.getElementById("locationResult").innerHTML =
          "Geolocation is not supported by this browser.";
      }
    }

    function showPosition(position) {
      document.getElementById("locationResult").innerHTML =
        "Latitude: " +
        position.coords.latitude +
        "<br>Longitude: " +
        position.coords.longitude;
    }

    function showError(error) {
      let message = "";

      switch (error.code) {
        case error.PERMISSION_DENIED:
          message = "Location access denied by user.";
          break;

        case error.POSITION_UNAVAILABLE:
          message = "Location information unavailable.";
          break;

        case error.TIMEOUT:
          message = "Request timed out.";
          break;

        default:
          message = "Unknown error occurred.";
      }

      document.getElementById("locationResult").innerHTML = message;
    }
    // Event Details using Data Types
const eventName = "Music Festival";
const eventDate = "2026-06-15";
let availableSeats = 100;

// Display Event Information using Template Literals
let eventInfo = `Event: ${eventName}
Date: ${eventDate}
Available Seats: ${availableSeats}`;

console.log(eventInfo);

// Registration Function using -- Operator
function registerParticipant() {
  availableSeats--;

  document.getElementById("seatCount").innerHTML =
    `Available Seats: ${availableSeats}`;

  alert(`Registration Successful!\nRemaining Seats: ${availableSeats}`);
}
// Event List
const events = [
  {
    name: "Music Festival",
    date: "2026-12-15",
    seats: 50,
  },
  {
    name: "Food Fair",
    date: "2025-01-10",
    seats: 30,
  },
  {
    name: "Sports Day",
    date: "2026-08-20",
    seats: 0,
  },
  {
    name: "Health Camp",
    date: "2026-10-05",
    seats: 25,
  },
];

// Display Only Upcoming Events with Available Seats
function displayEvents() {
  const eventList = document.getElementById("eventList");
  eventList.innerHTML = "";

  const today = new Date();

  events.forEach((event) => {
    const eventDate = new Date(event.date);

    // if-else condition
    if (eventDate > today && event.seats > 0) {
      const li = document.createElement("li");
      li.innerHTML = `${event.name} - ${event.date} - Seats: ${event.seats}`;
      eventList.appendChild(li);
    } else {
      console.log(`${event.name} is hidden (Past event or Full)`);
    }
  });
}

// Registration with Error Handling
function registerForEvent(eventName) {
  try {
    const event = events.find((e) => e.name === eventName);

    if (!event) {
      throw new Error("Event not found");
    }

    if (event.seats <= 0) {
      throw new Error("No seats available");
    }

    event.seats--;

    alert(
      `Registration Successful for ${event.name}\nRemaining Seats: ${event.seats}`,
    );

    displayEvents();
  } catch (error) {
    alert("Registration Error: " + error.message);
    console.error(error);
  }
}

// Run when page loads
window.addEventListener("load", displayEvents);
let communityEvents = [
  {
    name: "Music Festival",
    category: "Entertainment",
    seats: 50,
  },
  {
    name: "Food Fair",
    category: "Food",
    seats: 30,
  },
  {
    name: "Sports Day",
    category: "Sports",
    seats: 20,
  },
  {
    name: "Health Camp",
    category: "Health",
    seats: 25,
  },
];

function addEvent(name, category, seats) {
  communityEvents.push({
    name: name,
    category: category,
    seats: seats,
  });

  console.log(`${name} added successfully`);
}

function registerUser(eventName) {
  let event = communityEvents.find((e) => e.name === eventName);

  if (event && event.seats > 0) {
    event.seats--;
    console.log(`Registered for ${eventName}`);
    console.log(`Remaining Seats: ${event.seats}`);
  } else {
    console.log("Registration Failed");
  }
}

function filterEventsByCategory(category, callback) {
  let filteredEvents = communityEvents.filter(
    (event) => event.category === category,
  );

  callback(filteredEvents);
}

function displayFilteredEvents(events) {
  console.log("Filtered Events:");

  events.forEach((event) => {
    console.log(
      `${event.name} | ${event.category} | Seats: ${event.seats}`
    );
  });
}

function createRegistrationTracker(category) {
  let totalRegistrations = 0;

  return function () {
    totalRegistrations++;

    console.log(
      `${category} Registrations: ${totalRegistrations}`,
    );
  };
}

const entertainmentTracker =
  createRegistrationTracker("Entertainment");


addEvent("Cultural Night", "Entertainment", 40);

registerUser("Music Festival");

entertainmentTracker();
entertainmentTracker();
entertainmentTracker();

filterEventsByCategory(
  "Entertainment",
  displayFilteredEvents
);
class Event {
  constructor(name, category, seats) {
    this.name = name;
    this.category = category;
    this.seats = seats;
  }
}

Event.prototype.checkAvailability = function () {
  if (this.seats > 0) {
    return `${this.name}: Seats Available (${this.seats})`;
  } else {
    return `${this.name}: Fully Booked`;
  }
};

const event1 = new Event(
  "Music Festival",
  "Entertainment",
  50,
);

const event2 = new Event(
  "Sports Day",
  "Sports",
  0,
);

console.log(event1.checkAvailability());
console.log(event2.checkAvailability());
console.log("Event 1 Details:");

Object.entries(event1).forEach(([key, value]) => {
  console.log(`${key}: ${value}`);
});
let communityEventsArray = [
  {
    name: "Music Festival",
    category: "Music",
  },
  {
    name: "Food Fair",
    category: "Food",
  },
  {
    name: "Sports Day",
    category: "Sports",
  },
];

communityEventsArray.push({
  name: "Classical Music Night",
  category: "Music",
});

communityEventsArray.push({
  name: "Baking Workshop",
  category: "Workshop",
});

console.log("All Events:");
console.log(communityEventsArray);

const musicEvents = communityEventsArray.filter(
  (event) => event.category === "Music",
);

console.log("Music Events:");
console.log(musicEvents);

// Use .map() to format display cards
const displayCards = communityEventsArray.map(
  (event) => `Workshop on ${event.name}`,
);

console.log("Formatted Display Cards:");
displayCards.forEach((card) => console.log(card));