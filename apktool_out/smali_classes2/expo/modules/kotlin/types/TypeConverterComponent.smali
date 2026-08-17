.class public final Lexpo/modules/kotlin/types/TypeConverterComponent;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Type:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J;\u0010\n\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0000\"\n\u0008\u0001\u0010\u0007\u0018\u0001*\u00020\u00012\u0014\u0008\u0004\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0008H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\r\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R#\u0010\u0015\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00140\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u0019"
    }
    d2 = {
        "Lexpo/modules/kotlin/types/TypeConverterComponent;",
        "",
        "Type",
        "LC7/o;",
        "desireType",
        "<init>",
        "(LC7/o;)V",
        "P0",
        "Lkotlin/Function1;",
        "body",
        "from",
        "(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/types/TypeConverterComponent;",
        "Lkotlin/Pair;",
        "Lexpo/modules/kotlin/types/TypeConverter;",
        "build",
        "()Lkotlin/Pair;",
        "LC7/o;",
        "getDesireType",
        "()LC7/o;",
        "Lkotlin/Lazy;",
        "Lexpo/modules/kotlin/types/TypeConverterCollection;",
        "desireTypeConverter",
        "Lkotlin/Lazy;",
        "getDesireTypeConverter",
        "()Lkotlin/Lazy;",
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
.field private final desireType:LC7/o;

.field private final desireTypeConverter:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LC7/o;)V
    .locals 1

    .line 1
    const-string v0, "desireType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lexpo/modules/kotlin/types/TypeConverterComponent;->desireType:LC7/o;

    .line 10
    .line 11
    new-instance p1, Lexpo/modules/kotlin/types/l;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Lexpo/modules/kotlin/types/l;-><init>(Lexpo/modules/kotlin/types/TypeConverterComponent;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lexpo/modules/kotlin/types/TypeConverterComponent;->desireTypeConverter:Lkotlin/Lazy;

    .line 21
    .line 22
    return-void
.end method

.method public static synthetic a(Lexpo/modules/kotlin/types/TypeConverterComponent;)Lexpo/modules/kotlin/types/TypeConverterCollection;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/kotlin/types/TypeConverterComponent;->desireTypeConverter$lambda$0(Lexpo/modules/kotlin/types/TypeConverterComponent;)Lexpo/modules/kotlin/types/TypeConverterCollection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final desireTypeConverter$lambda$0(Lexpo/modules/kotlin/types/TypeConverterComponent;)Lexpo/modules/kotlin/types/TypeConverterCollection;
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/kotlin/types/TypeConverterCollection;

    .line 2
    .line 3
    iget-object p0, p0, Lexpo/modules/kotlin/types/TypeConverterComponent;->desireType:LC7/o;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lexpo/modules/kotlin/types/TypeConverterCollection;-><init>(LC7/o;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method


# virtual methods
.method public final build()Lkotlin/Pair;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Pair<",
            "LC7/o;",
            "Lexpo/modules/kotlin/types/TypeConverter<",
            "*>;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/types/TypeConverterComponent;->desireTypeConverter:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lexpo/modules/kotlin/types/TypeConverterCollection;

    .line 10
    .line 11
    iget-object v1, p0, Lexpo/modules/kotlin/types/TypeConverterComponent;->desireType:LC7/o;

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lexpo/modules/kotlin/types/TypeConverterCollection;-><init>(LC7/o;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lexpo/modules/kotlin/types/TypeConverterComponent;->desireTypeConverter:Lkotlin/Lazy;

    .line 17
    .line 18
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lexpo/modules/kotlin/types/TypeConverterCollection;

    .line 23
    .line 24
    invoke-virtual {v1}, Lexpo/modules/kotlin/types/TypeConverterCollection;->getConverters()Ljava/util/Map;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/types/TypeConverterCollection;->setConverters(Ljava/util/Map;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lexpo/modules/kotlin/types/TypeConverterComponent;->desireType:LC7/o;

    .line 32
    .line 33
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0

    .line 38
    :cond_0
    const/4 v0, 0x0

    .line 39
    return-object v0
.end method

.method public final synthetic from(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/types/TypeConverterComponent;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P0:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lexpo/modules/kotlin/types/TypeConverterComponent<",
            "TType;>;"
        }
    .end annotation

    .line 1
    const-string v0, "body"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lexpo/modules/kotlin/types/TypeConverterComponent;->getDesireTypeConverter()Lkotlin/Lazy;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lexpo/modules/kotlin/types/TypeConverterCollection;

    .line 15
    .line 16
    invoke-virtual {v0}, Lexpo/modules/kotlin/types/TypeConverterCollection;->getConverters()Ljava/util/Map;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x6

    .line 21
    const-string v2, "P0"

    .line 22
    .line 23
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Lexpo/modules/kotlin/types/TypeConverterCollection$from$1;

    .line 27
    .line 28
    invoke-direct {v1, p1}, Lexpo/modules/kotlin/types/TypeConverterCollection$from$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    return-object p0
.end method

.method public final getDesireType()LC7/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/types/TypeConverterComponent;->desireType:LC7/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDesireTypeConverter()Lkotlin/Lazy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Lazy;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/types/TypeConverterComponent;->desireTypeConverter:Lkotlin/Lazy;

    .line 2
    .line 3
    return-object v0
.end method
