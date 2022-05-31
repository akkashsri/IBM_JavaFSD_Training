import React from "react";

// class Football extends React.Component{
//
// }
function Football() {
    /*  const shoot = () => {
          alert("Great Shot!");
      }*/
    function shoot(result) {
        alert("Great Shoot"+result);
    }
    return (
        // <button onClick={shoot}>Take the shot!</button>
        <button onClick={()=> shoot("Goal!")}>Take the shot!</button>
    );
}
export default Football;