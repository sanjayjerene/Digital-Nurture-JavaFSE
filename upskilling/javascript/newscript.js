const modernEvents = [
  {
    name: "Music Festival",
    category: "Music",
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
];

function displayEvent(eventName = "Unknown Event") {
  console.log(`Event Name: ${eventName}`);
}


const { name, category, seats } = modernEvents[0];

console.log("Destructured Event Details:");
console.log(name);
console.log(category);
console.log(seats);
const clonedEvents = [...modernEvents];

const musicOnlyEvents = clonedEvents.filter(
  (event) => event.category === "Music",
);

console.log("Music Events:");
console.log(musicOnlyEvents);
displayEvent();
displayEvent("Health Camp");