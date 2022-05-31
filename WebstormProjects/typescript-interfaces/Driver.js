"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const CricketCoach_1 = require("./CricketCoach");
const GolfCoach_1 = require("./GolfCoach");
let myCricketCoach = new CricketCoach_1.CricketCoach();
console.log(myCricketCoach.getDailyWorkout());
let myGolfCoach = new GolfCoach_1.GolfCoach();
console.log(myGolfCoach.getDailyWorkout());
