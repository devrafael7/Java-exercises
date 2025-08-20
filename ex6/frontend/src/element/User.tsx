import { useState } from "react";
import { createUser, type User } from "../model/User";

export default function User() {
  const [user, setUser] = useState<User | null>(null);

  const handleAddUser = async () => {
    try {
      const newUser = await createUser({
        username: "Rafael",
        age: 19,
        email: "rafa@gmail.com",
        password: "rafa123",
      });

      setUser(newUser);
    } catch (error) {
      console.log(error);
    }
  };

  return (
    <div className="flex flex-col items-center p-7">
      <h1 className="text-3xl">Users</h1>
      {user && (
        <div>
          {user.username} - {user.age} - {user.email} - {user.password}
        </div>
      )}
      <button
        className="bg-blue-500 px-8 py-1 rounded-md my-3 cursor-pointer hover:bg-blue-600 transition-all"
        onClick={handleAddUser}
      >
        Add User
      </button>
    </div>
  );
}
