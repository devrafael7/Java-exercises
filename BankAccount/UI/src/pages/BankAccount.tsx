import BalanceUI from "../components/BalanceUI";
import type { User } from "../types/User";
import { getBalance } from "../api/balanceAPI";
import { useEffect, useState } from "react";

export default function BankAccount() {
  const [currentUser, setCurrentUser] = useState<User>({
    id: 7,
    name: "Rafael",
  });

  const [userBalance, setUserBalance] = useState<any>();

  useEffect(() => {
    async function fetchBalance() {
      const result = await getBalance(currentUser.id);
      setUserBalance(result);
    }

    fetchBalance();
  }, [currentUser.id]);

  return (
    <div className="flex flex-col w-full min-h-screen p-7">
      <h1 className="self-center text-2xl mb-7">
        Welcome to your bank account!
      </h1>

       <button
        onClick={() =>
          setCurrentUser((prev) => ({
            ...prev,
            id: prev.id === 1 ? 2 : 1,
          }))
        }
        className="mb-5 p-2 bg-blue-500 text-white rounded"
      >
        Change User
      </button>

      {userBalance ? (
        <BalanceUI color="darkMode" size="medium" boldLevel="medium">
          Balance: R${userBalance.name}
        </BalanceUI>
      ) : (
        <p className="text-center">Loading balance...</p>
      )}
    </div>
  );
}
