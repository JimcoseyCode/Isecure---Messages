.class public final Lexpo/modules/kotlin/records/formatters/Formatter$Builder;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/kotlin/records/formatters/Formatter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<RecordType::",
        "Lexpo/modules/kotlin/records/Record;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0008\u0007\u0018\u0000*\u0008\u0008\u0001\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J=\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00028\u00020\tR\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\n\"\u0004\u0008\u0002\u0010\u00062\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJA\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00028\u00020\rR\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\n\"\u0008\u0008\u0002\u0010\u0006*\u00020\u00012\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000eJ\u0015\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u000fH\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R2\u0010\u0014\u001a\u0012\u0012\u000e\u0012\u000c\u0012\u0004\u0012\u00028\u0001\u0012\u0002\u0008\u00030\n0\u00138\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lexpo/modules/kotlin/records/formatters/Formatter$Builder;",
        "Lexpo/modules/kotlin/records/Record;",
        "RecordType",
        "",
        "<init>",
        "()V",
        "PropertyType",
        "LC7/m;",
        "propertyRef",
        "Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;",
        "Lexpo/modules/kotlin/records/formatters/PropertySelector;",
        "property",
        "(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;",
        "Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilderForRecord;",
        "(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilderForRecord;",
        "Lexpo/modules/kotlin/records/formatters/Formatter;",
        "build$expo_modules_core_release",
        "()Lexpo/modules/kotlin/records/formatters/Formatter;",
        "build",
        "",
        "selectors",
        "Ljava/util/List;",
        "getSelectors$expo_modules_core_release",
        "()Ljava/util/List;",
        "setSelectors$expo_modules_core_release",
        "(Ljava/util/List;)V",
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
.field private selectors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lexpo/modules/kotlin/records/formatters/PropertySelector<",
            "TRecordType;*>;>;"
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
    iput-object v0, p0, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->selectors:Ljava/util/List;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic a(LC7/m;LC7/m;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->property$lambda$0(LC7/m;LC7/m;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic b(LC7/m;LC7/m;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->property$lambda$1(LC7/m;LC7/m;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final property$lambda$0(LC7/m;LC7/m;)Z
    .locals 1

    .line 1
    const-string v0, "property"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method private static final property$lambda$1(LC7/m;LC7/m;)Z
    .locals 2

    .line 1
    const-string v0, "property"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, LC7/c;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {p0}, LC7/c;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-interface {p1}, LC7/c;->getReturnType()LC7/o;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {p0}, LC7/c;->getReturnType()LC7/o;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p1, p0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    const/4 p0, 0x1

    .line 35
    return p0

    .line 36
    :cond_0
    const/4 p0, 0x0

    .line 37
    return p0
.end method


# virtual methods
.method public final build$expo_modules_core_release()Lexpo/modules/kotlin/records/formatters/Formatter;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lexpo/modules/kotlin/records/formatters/Formatter<",
            "TRecordType;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lexpo/modules/kotlin/records/formatters/Formatter;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->selectors:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lexpo/modules/kotlin/records/formatters/Formatter;-><init>(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final getSelectors$expo_modules_core_release()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lexpo/modules/kotlin/records/formatters/PropertySelector<",
            "TRecordType;*>;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->selectors:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final property(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<PropertyType:",
            "Ljava/lang/Object;",
            ">(",
            "LC7/m;",
            ")",
            "Lexpo/modules/kotlin/records/formatters/PropertySelector<",
            "TRecordType;TPropertyType;>.ActionBuilder<TPropertyType;>;"
        }
    .end annotation

    const-string v0, "propertyRef"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lexpo/modules/kotlin/records/formatters/PropertySelector;

    new-instance v1, Lexpo/modules/kotlin/records/formatters/b;

    invoke-direct {v1, p1}, Lexpo/modules/kotlin/records/formatters/b;-><init>(LC7/m;)V

    invoke-direct {v0, v1}, Lexpo/modules/kotlin/records/formatters/PropertySelector;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 2
    iget-object p1, p0, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->selectors:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3
    new-instance p1, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;

    invoke-direct {p1, v0}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilder;-><init>(Lexpo/modules/kotlin/records/formatters/PropertySelector;)V

    return-object p1
.end method

.method public final property(LC7/m;)Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilderForRecord;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<PropertyType::",
            "Lexpo/modules/kotlin/records/Record;",
            ">(",
            "LC7/m;",
            ")",
            "Lexpo/modules/kotlin/records/formatters/PropertySelector<",
            "TRecordType;TPropertyType;>.ActionBuilderForRecord<TPropertyType;>;"
        }
    .end annotation

    const-string v0, "propertyRef"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v0, Lexpo/modules/kotlin/records/formatters/PropertySelector;

    new-instance v1, Lexpo/modules/kotlin/records/formatters/a;

    invoke-direct {v1, p1}, Lexpo/modules/kotlin/records/formatters/a;-><init>(LC7/m;)V

    invoke-direct {v0, v1}, Lexpo/modules/kotlin/records/formatters/PropertySelector;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 5
    iget-object p1, p0, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->selectors:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    new-instance p1, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilderForRecord;

    invoke-direct {p1, v0}, Lexpo/modules/kotlin/records/formatters/PropertySelector$ActionBuilderForRecord;-><init>(Lexpo/modules/kotlin/records/formatters/PropertySelector;)V

    return-object p1
.end method

.method public final setSelectors$expo_modules_core_release(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lexpo/modules/kotlin/records/formatters/PropertySelector<",
            "TRecordType;*>;>;)V"
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
    iput-object p1, p0, Lexpo/modules/kotlin/records/formatters/Formatter$Builder;->selectors:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method
