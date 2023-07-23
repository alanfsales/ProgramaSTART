import './App.css';
import styled from 'styled-components';

const Titulo = styled.h1`
  color: #31e636; 
  text-decoration: underline;
`;

const Subitulo = styled.h2`color: green; font-size: 30px;`;

const Artigo = styled.section`color: #9393e2; margin: 5%;`;

const Titulo2 = styled.h1`color: blue; font-size: 25px;`;

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <Titulo>Meu Site</Titulo>
        <Subitulo>Subitulo</Subitulo>
        <Artigo>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus vel mattis nulla. Suspendisse sed commodo diam. Aenean gravida eros a ullamcorper ultricies. Quisque sit amet urna dapibus, accumsan nulla ut, dapibus felis. Maecenas pellentesque leo sit amet libero consectetur, vel eleifend velit accumsan. Ut tempus augue arcu, et vulputate lorem mollis iaculis. Sed vitae tortor eu arcu condimentum gravida ut a nulla. Cras rhoncus ornare augue, id sagittis dui mollis a.</Artigo>
        <Titulo2>Segunda Parte</Titulo2>
        <Artigo>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus vel mattis nulla. Suspendisse sed commodo diam. Aenean gravida eros a ullamcorper ultricies. Quisque sit amet urna dapibus, accumsan nulla ut, dapibus felis. Maecenas pellentesque leo sit amet libero consectetur, vel eleifend velit accumsan. Ut tempus augue arcu, et vulputate lorem mollis iaculis. Sed vitae tortor eu arcu condimentum gravida ut a nulla. Cras rhoncus ornare augue, id sagittis dui mollis a.</Artigo>
      </header>
    </div>
  );
}

export default App;
