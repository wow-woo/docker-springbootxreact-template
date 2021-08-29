import React, { useState } from "react";
import "./App.css";

function App() {
  const [name, setName] = useState("");

  return (
    <div className='App'>
      React is working....
      <button
        onClick={async () => {
          const res = await fetch("http://localhost:3000/yourname", {
            method: "POST",
            mode: "cors",
            credentials: "same-origin",
          });
          console.log("res ", res);

          const data = await res.text();

          setName(data);
        }}
      >
        click here!
      </button>
      {name && <p>my name is {name}</p>}
    </div>
  );
}

export default App;
