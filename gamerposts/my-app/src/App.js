import {Router} from "react-router-dom";
import Footer from "./fragments/Footer";


function App() {
  return (
      <Router>
        <AuthProvider>
          <Navbar />
          <div className="container mt-3">
            <Routes>
              <Route path="" element={<SignUp />} />
              <Route path="" element={} />
              <Route path=""  element={} />
              <Route path="" element={} />
              <Route path=""  element={} />
              <Route path="" element={} />
            </Routes>
          </div>
          <Footer />
        </AuthProvider>
      </Router>
  );
}

export default App;
