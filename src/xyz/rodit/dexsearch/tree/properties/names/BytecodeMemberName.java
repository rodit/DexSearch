package xyz.rodit.dexsearch.tree.properties.names;

import org.jf.dexlib2.iface.reference.Reference;
import xyz.rodit.dexsearch.resolver.Resolver;
import xyz.rodit.dexsearch.tree.bindings.ClassBinding;

public interface BytecodeMemberName {

    boolean matches(Resolver resolver, ClassBinding owner, String name, Class<? extends Reference> type);
}
