let sportsOne: string[] = ["Golf", "Cricket", "Tennis", "Swimming"];

// for (let i = 0; i < sportsOne.length; i++) {
//     console.log(sportsOne[i]);
// }

for (let tempSort of sportsOne) {
    if(tempSort == "Cricket") {
        console.log(tempSort + " << My Favourite!")
    } else {
        console.log(tempSort);
    }
}