const balance_API_URL = "https://jsonplaceholder.typicode.com/users"

export async function getBalance(user_id: number){
    const res = await fetch(balance_API_URL);
    const data = await res.json();

    const user = data.find((user: any) => user.id === user_id);

    return user;
}