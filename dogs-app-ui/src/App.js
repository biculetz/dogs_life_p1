import 'bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import NumberOfDogs from './components/NumberOfDogs'
import AllDogs from './components/AllDogs'
import { Route } from 'react-router-dom';
import { Routes } from 'react-router-dom';

function App() {
  return (
    <>
      <Navbar expand="lg" className="bg-body-tertiary">
        <Container>

          <Navbar.Brand href="#home">Dogs</Navbar.Brand>
          <Navbar.Toggle aria-controls="basic-navbar-nav" />
          <Navbar.Collapse id="basic-navbar-nav">
            <Nav className="me-auto">
              <Nav.Link href="#home">All Dogs</Nav.Link>
              <Nav.Link href="#link">Number Of Dogs</Nav.Link>
            </Nav>
          </Navbar.Collapse>

        </Container>
      </Navbar>
      <Routes>
        <Route path="/all" element={AllDogs} />
        <Route path="/number" element={<NumberOfDogs/>} />
      
      </Routes>
    </>
  );

}

export default App;
