import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.test.expect

internal class FuncionarioTest {

    val funcionario = Funcionario("123", "João Vitor de Abreu", "Desenvolvedor", 2500.0)

    @Test
    fun bonificacaoTest() {
        funcionario.bonificacao(100.0)
        assertEquals(2600.0, funcionario.salario)
    }

    @Test
    fun baterPontoTeste(){
        funcionario.baterPonto()
        assert(true)
    }

    @Test
    fun  descontarSalarioTeste(){
        funcionario.descontarSalario(100.0)
        assertEquals(2400.0, funcionario.salario)
    }

    var erro =false
    @Test
    fun criarFunErrado(){
        try {
            val funcionario = Funcionario("123", "", "Dev", 2000.0)
        } catch (e: Exception){
            erro = true
        }

        assertTrue(erro)

    }

}