import type React from "react";
import { tv } from "tailwind-variants"

const balanceTV = tv({
    base: "rounded",
    variants: {
        color: {
            default: "bg-gray-200 text-black",
            darkMode: "bg-gray-700 text-gray-100",
            lightMode: "bg-white text-black",
        },
        size: {
            small: "text-sm px-2 py-2",
            medium: "text-base px-4 py-3",
            large: "text-lg px-6 py-6",
        },
        boldLevel: {
            light: "font-base",
            medium: "font-semibold",
            strong: "font-bold",
        },
    },
    defaultVariants: {
        color: "default",
        size: "medium",
    },
});

type BalanceProps = {
    color?: "default" | "darkMode" |"lightMode";
    size?: "small" | "medium" | "large";
    boldLevel?: "light" | "medium" | "strong";
    children?: React.ReactNode;
};

export default function BalanceUI({ color, size, boldLevel, children }: BalanceProps){
  
  return (  
    <div className={`${balanceTV({ color, size, boldLevel})} flex justify-center items-center`}>
        {children}
    </div>
  )

}
