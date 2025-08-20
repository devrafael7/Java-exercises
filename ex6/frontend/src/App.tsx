import { BrowserRouter, Routes, Route } from "react-router-dom"

import User from "./element/User"
import Home from "./pages/Home"
import Post from "./element/Post"

function App() {

  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Home/>} />
        <Route path="/User" element={<User/>} />
        <Route path="/Post" element={<Post/>} />
      </Routes>
    </BrowserRouter>
  )
}

export default App
