.class public final Lexpo/modules/kotlin/modules/ModuleConvertersBuilder;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J2\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0007\"\n\u0008\u0000\u0010\u0004\u0018\u0001*\u00020\u00012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\u0008\u00a2\u0006\u0004\u0008\u0008\u0010\tJW\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0007\"\n\u0008\u0000\u0010\u0004\u0018\u0001*\u00020\u0001\"\n\u0008\u0001\u0010\n\u0018\u0001*\u00020\u00012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00052\u0014\u0008\u0004\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R2\u0010\u0012\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00070\u00118\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0012\u0010\u0013\u0012\u0004\u0008\u0018\u0010\u0003\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u0019"
    }
    d2 = {
        "Lexpo/modules/kotlin/modules/ModuleConvertersBuilder;",
        "",
        "<init>",
        "()V",
        "T",
        "LC7/d;",
        "classifier",
        "Lexpo/modules/kotlin/types/TypeConverterComponent;",
        "TypeConverter",
        "(LC7/d;)Lexpo/modules/kotlin/types/TypeConverterComponent;",
        "P0",
        "Lkotlin/Function1;",
        "body",
        "(LC7/d;Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/types/TypeConverterComponent;",
        "Lexpo/modules/kotlin/types/TypeConverterProvider;",
        "buildTypeConverterProvider",
        "()Lexpo/modules/kotlin/types/TypeConverterProvider;",
        "",
        "convertersComponent",
        "Ljava/util/List;",
        "getConvertersComponent",
        "()Ljava/util/List;",
        "setConvertersComponent",
        "(Ljava/util/List;)V",
        "getConvertersComponent$annotations",
        "expo-modules-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private convertersComponent:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lexpo/modules/kotlin/types/TypeConverterComponent<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lexpo/modules/kotlin/modules/ModuleConvertersBuilder;->convertersComponent:Ljava/util/List;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic TypeConverter$default(Lexpo/modules/kotlin/modules/ModuleConvertersBuilder;LC7/d;ILjava/lang/Object;)Lexpo/modules/kotlin/types/TypeConverterComponent;
    .locals 3

    and-int/lit8 p2, p2, 0x1

    .line 1
    const-class p3, Ljava/lang/Object;

    const/4 v0, 0x4

    const-string v1, "T"

    if-eqz p2, :cond_0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {p3}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object p1

    :cond_0
    const-string p2, "classifier"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lexpo/modules/kotlin/types/TypeConverterComponent;

    .line 3
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object p2, Lexpo/modules/kotlin/modules/ModuleConvertersBuilder$TypeConverter$$inlined$lazyTypeOf$1;->INSTANCE:Lexpo/modules/kotlin/modules/ModuleConvertersBuilder$TypeConverter$$inlined$lazyTypeOf$1;

    .line 4
    new-instance v2, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {p3}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object p3

    const/4 v0, 0x3

    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v0, 0x0

    .line 6
    invoke-direct {v2, p3, v0, p2}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 7
    invoke-direct {p1, v2}, Lexpo/modules/kotlin/types/TypeConverterComponent;-><init>(LC7/o;)V

    .line 8
    invoke-virtual {p0}, Lexpo/modules/kotlin/modules/ModuleConvertersBuilder;->getConvertersComponent()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p1
.end method

.method public static synthetic TypeConverter$default(Lexpo/modules/kotlin/modules/ModuleConvertersBuilder;LC7/d;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lexpo/modules/kotlin/types/TypeConverterComponent;
    .locals 3

    and-int/lit8 p3, p3, 0x1

    .line 9
    const-class p4, Ljava/lang/Object;

    const/4 v0, 0x4

    const-string v1, "T"

    if-eqz p3, :cond_0

    .line 10
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {p4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object p1

    .line 11
    :cond_0
    const-string p3, "classifier"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "body"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    new-instance p1, Lexpo/modules/kotlin/types/TypeConverterComponent;

    .line 13
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object p3, Lexpo/modules/kotlin/modules/ModuleConvertersBuilder$TypeConverter$$inlined$TypeConverter$1;->INSTANCE:Lexpo/modules/kotlin/modules/ModuleConvertersBuilder$TypeConverter$$inlined$TypeConverter$1;

    .line 14
    new-instance v2, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {p4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object p4

    const/4 v0, 0x3

    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v0, 0x0

    .line 16
    invoke-direct {v2, p4, v0, p3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 17
    invoke-direct {p1, v2}, Lexpo/modules/kotlin/types/TypeConverterComponent;-><init>(LC7/o;)V

    .line 18
    invoke-virtual {p0}, Lexpo/modules/kotlin/modules/ModuleConvertersBuilder;->getConvertersComponent()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19
    invoke-virtual {p1}, Lexpo/modules/kotlin/types/TypeConverterComponent;->getDesireTypeConverter()Lkotlin/Lazy;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lexpo/modules/kotlin/types/TypeConverterCollection;

    .line 20
    invoke-virtual {p0}, Lexpo/modules/kotlin/types/TypeConverterCollection;->getConverters()Ljava/util/Map;

    move-result-object p0

    const/4 p3, 0x6

    const-string p4, "P0"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    new-instance p3, Lexpo/modules/kotlin/modules/ModuleConvertersBuilder$TypeConverter$lambda$1$$inlined$from$1;

    invoke-direct {p3, p2}, Lexpo/modules/kotlin/modules/ModuleConvertersBuilder$TypeConverter$lambda$1$$inlined$from$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    const/4 p2, 0x0

    invoke-interface {p0, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public static synthetic getConvertersComponent$annotations()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final synthetic TypeConverter(LC7/d;)Lexpo/modules/kotlin/types/TypeConverterComponent;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LC7/d;",
            ")",
            "Lexpo/modules/kotlin/types/TypeConverterComponent<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "classifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance p1, Lexpo/modules/kotlin/types/TypeConverterComponent;

    .line 2
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v0, Lexpo/modules/kotlin/modules/ModuleConvertersBuilder$TypeConverter$$inlined$lazyTypeOf$1;->INSTANCE:Lexpo/modules/kotlin/modules/ModuleConvertersBuilder$TypeConverter$$inlined$lazyTypeOf$1;

    .line 3
    new-instance v1, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v2, 0x4

    const-string v3, "T"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v2, Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    const/4 v4, 0x3

    .line 4
    invoke-static {v4, v3}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v3, 0x0

    .line 5
    invoke-direct {v1, v2, v3, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 6
    invoke-direct {p1, v1}, Lexpo/modules/kotlin/types/TypeConverterComponent;-><init>(LC7/o;)V

    .line 7
    invoke-virtual {p0}, Lexpo/modules/kotlin/modules/ModuleConvertersBuilder;->getConvertersComponent()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p1
.end method

.method public final synthetic TypeConverter(LC7/d;Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/types/TypeConverterComponent;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            ">(",
            "LC7/d;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lexpo/modules/kotlin/types/TypeConverterComponent<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "classifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "body"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    new-instance p1, Lexpo/modules/kotlin/types/TypeConverterComponent;

    .line 9
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v0, Lexpo/modules/kotlin/modules/ModuleConvertersBuilder$TypeConverter$$inlined$TypeConverter$1;->INSTANCE:Lexpo/modules/kotlin/modules/ModuleConvertersBuilder$TypeConverter$$inlined$TypeConverter$1;

    .line 10
    new-instance v1, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v2, 0x4

    const-string v3, "T"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v2, Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    const/4 v4, 0x3

    .line 11
    invoke-static {v4, v3}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v3, 0x0

    .line 12
    invoke-direct {v1, v2, v3, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 13
    invoke-direct {p1, v1}, Lexpo/modules/kotlin/types/TypeConverterComponent;-><init>(LC7/o;)V

    .line 14
    invoke-virtual {p0}, Lexpo/modules/kotlin/modules/ModuleConvertersBuilder;->getConvertersComponent()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    invoke-virtual {p1}, Lexpo/modules/kotlin/types/TypeConverterComponent;->getDesireTypeConverter()Lkotlin/Lazy;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/types/TypeConverterCollection;

    .line 16
    invoke-virtual {v0}, Lexpo/modules/kotlin/types/TypeConverterCollection;->getConverters()Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x6

    const-string v2, "P0"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    new-instance v1, Lexpo/modules/kotlin/modules/ModuleConvertersBuilder$TypeConverter$lambda$1$$inlined$from$1;

    invoke-direct {v1, p2}, Lexpo/modules/kotlin/modules/ModuleConvertersBuilder$TypeConverter$lambda$1$$inlined$from$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    const/4 p2, 0x0

    invoke-interface {v0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public final buildTypeConverterProvider()Lexpo/modules/kotlin/types/TypeConverterProvider;
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/modules/ModuleConvertersBuilder;->convertersComponent:Ljava/util/List;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lexpo/modules/kotlin/types/TypeConverterComponent;

    .line 23
    .line 24
    invoke-virtual {v2}, Lexpo/modules/kotlin/types/TypeConverterComponent;->build()Lkotlin/Pair;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    new-instance v0, Lexpo/modules/kotlin/modules/ModuleConvertersBuilder$buildTypeConverterProvider$1;

    .line 35
    .line 36
    invoke-direct {v0, v1}, Lexpo/modules/kotlin/modules/ModuleConvertersBuilder$buildTypeConverterProvider$1;-><init>(Ljava/util/List;)V

    .line 37
    .line 38
    .line 39
    return-object v0
.end method

.method public final getConvertersComponent()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lexpo/modules/kotlin/types/TypeConverterComponent<",
            "*>;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/modules/ModuleConvertersBuilder;->convertersComponent:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setConvertersComponent(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lexpo/modules/kotlin/types/TypeConverterComponent<",
            "*>;>;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lexpo/modules/kotlin/modules/ModuleConvertersBuilder;->convertersComponent:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method
