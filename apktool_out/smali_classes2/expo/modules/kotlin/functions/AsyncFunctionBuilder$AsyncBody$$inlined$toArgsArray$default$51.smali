.class public final Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$51;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->AsyncBody(Lw7/t;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;
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
    xi = 0xb0
.end annotation


# static fields
.field public static final INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$51;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$51;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$51;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$51;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$51;

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
    .locals 2

    const/4 v0, 0x6

    .line 1
    const-string v1, "P1"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$51;->invoke()LC7/o;

    move-result-object v0

    return-object v0
.end method
