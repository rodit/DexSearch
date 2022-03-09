package xyz.rodit.dexsearch.tree.nodes.bytecode.matchers;

import org.jf.dexlib2.iface.Method;
import org.jf.dexlib2.iface.instruction.Instruction;
import org.jf.dexlib2.iface.instruction.ReferenceInstruction;
import org.jf.dexlib2.iface.reference.TypeReference;
import xyz.rodit.dexsearch.resolver.Resolver;
import xyz.rodit.dexsearch.tree.bindings.ClassBinding;
import xyz.rodit.dexsearch.tree.properties.types.Type;

public class TypeReferenceMatcher extends SingleInstructionMatcher {

    private final Type type;

    public TypeReferenceMatcher(Type type) {
        this.type = type;
    }

    @Override
    public boolean matches(Resolver resolver, ClassBinding binding, Method method, Instruction instruction) {
        return instruction instanceof ReferenceInstruction ref
                && ref.getReference() instanceof TypeReference typeRef
                && type.matches(resolver, binding, typeRef.getType());
    }
}
