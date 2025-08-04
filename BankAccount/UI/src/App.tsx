import { BrowserRouter as Router, Route, Routes } from 'react-router-dom'
import BankAccount from './pages/BankAccount'
import BalanceUI from './components/BalanceUI'

function App() {

  return (
    <Router>
      <Routes>
        <Route path='/bank-account' element={<BankAccount/>}/>
        <Route path='/balance-ui' element={<BalanceUI/>}/>
      </Routes>
    </Router>
  )
}

export default App
