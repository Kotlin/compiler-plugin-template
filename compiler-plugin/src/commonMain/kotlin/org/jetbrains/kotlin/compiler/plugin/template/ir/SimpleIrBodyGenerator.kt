package org.jetbrains.kotlin.compiler.plugin.template.ir

import org.jetbrains.kotlin.GeneratedDeclarationKey
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext
import org.jetbrains.kotlin.compiler.plugin.template.fir.SimpleClassGenerator
import org.jetbrains.kotlin.ir.declarations.IrConstructor
import org.jetbrains.kotlin.ir.declarations.IrSimpleFunction
import org.jetbrains.kotlin.ir.declarations.createBlockBody
import org.jetbrains.kotlin.ir.expressions.IrBody
import org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl
import org.jetbrains.kotlin.ir.expressions.impl.IrReturnImpl

class SimpleIrBodyGenerator(pluginContext: IrPluginContext) :
    AbstractTransformerForGenerator(pluginContext) {
    override fun interestedIn(key: GeneratedDeclarationKey?): Boolean {
        return key == SimpleClassGenerator.Key
    }

    override fun generateBodyForFunction(
        function: IrSimpleFunction,
        key: GeneratedDeclarationKey?,
    ): IrBody {
        require(
            function.name in
                listOf(SimpleClassGenerator.FOO_ID, SimpleClassGenerator.BAR_ID).map {
                    it.callableName
                }
        )
        val const =
            IrConstImpl.string(-1, -1, irBuiltIns.stringType, value = "Hello world")
        val returnStatement = IrReturnImpl(-1, -1, irBuiltIns.nothingType, function.symbol, const)
        return irFactory.createBlockBody(-1, -1, listOf(returnStatement))
    }

    override fun generateBodyForConstructor(
        constructor: IrConstructor,
        key: GeneratedDeclarationKey?,
    ): IrBody? {
        return generateBodyForDefaultConstructor(constructor)
    }
}
