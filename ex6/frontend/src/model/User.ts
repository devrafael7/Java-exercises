export interface User {
    username: string;
    age: number;
    email: string;
    password: string;
}

export async function getUser(): Promise<User> {
    const response = await fetch("http://localhost:8080/api/user");
    if (!response.ok) {
        throw new Error("Error when searching for user!");
    } 
    return response.json();
}

export async function createUser(user: User): Promise<User>{
    const response = await fetch("http://localhost:8080/api/user", {
        method: "POST",
        headers:{
            "Content-Type": "application/json",
        },
        body: JSON.stringify(user),
    });
    if (!response.ok){
        throw new Error("Error");
    }
    return response.json();
}
