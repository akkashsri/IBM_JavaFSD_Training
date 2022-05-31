"use strict";
var sportsOne = ["Golf", "Cricket", "Tennis", "Swimming"];
// for (let i = 0; i < sportsOne.length; i++) {
//     console.log(sportsOne[i]);
// }
for (var _i = 0, sportsOne_1 = sportsOne; _i < sportsOne_1.length; _i++) {
    var tempSort = sportsOne_1[_i];
    if (tempSort == "Cricket") {
        console.log(tempSort + " << My Favourite!");
    }
    else {
        console.log(tempSort);
    }
}
