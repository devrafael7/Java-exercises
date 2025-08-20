import type { User } from "./User";

export interface Post {
    user: User;
    title: string;
    image: string;
}

