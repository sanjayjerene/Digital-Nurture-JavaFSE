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