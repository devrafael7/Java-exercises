//import type { User } from "./ts/model/User";

import { useEffect, useState } from "react";

/*
const user1: User = {
  name: "Rafael",
  age: 19,
  email: "Rafael@gmail.com",
} 
*/

function App() {
  const [data, setData] = useState<any | null>(null);
  const [loading, setLoading] = useState(true);
-
  useEffect(()=>{
    fetch("http://localhost:8080/myapi/user")
      .then(response => response.json())
        .then((data) => {
          setData(data);
          setLoading(false);
        })
        .catch((error) => console.log("Error when searching for user: ", error));
  }, []);

  if (loading) return <p>Loading user data...</p>;

  return (
    <>
      <div className="userList">
        <h1>Users list</h1>
        { data && (
          <ul>
            <li>{data.name}</li>
            <li>{data.age}</li>
            <li>{data.email}</li>
          </ul>
        )

        }
      </div>
    </>
  );
}

export default App;
