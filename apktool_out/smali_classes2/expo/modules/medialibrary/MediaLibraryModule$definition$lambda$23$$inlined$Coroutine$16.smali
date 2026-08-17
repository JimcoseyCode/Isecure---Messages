.class public final Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$16;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/medialibrary/MediaLibraryModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lw7/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$16;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$16;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$16;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$16;->INSTANCE:Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$16;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final invoke()LC7/o;
    .locals 3

    .line 1
    sget-object v0, LC7/q;->c:LC7/q$a;

    const-class v1, Ljava/lang/String;

    invoke-static {v1}, Lkotlin/jvm/internal/D;->o(Ljava/lang/Class;)LC7/o;

    move-result-object v1

    invoke-virtual {v0, v1}, LC7/q$a;->d(LC7/o;)LC7/q;

    move-result-object v1

    const-class v2, Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/jvm/internal/D;->f(Ljava/lang/Class;)LC7/o;

    move-result-object v2

    invoke-virtual {v0, v2}, LC7/q$a;->d(LC7/o;)LC7/q;

    move-result-object v0

    const-class v2, Ljava/util/Map;

    invoke-static {v2, v1, v0}, Lkotlin/jvm/internal/D;->h(Ljava/lang/Class;LC7/q;LC7/q;)LC7/o;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lexpo/modules/medialibrary/MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$16;->invoke()LC7/o;

    move-result-object v0

    return-object v0
.end method
