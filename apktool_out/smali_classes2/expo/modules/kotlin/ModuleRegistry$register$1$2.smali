.class final Lexpo/modules/kotlin/ModuleRegistry$register$1$2;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/kotlin/ModuleRegistry;->register(Lexpo/modules/kotlin/modules/Module;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
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


# instance fields
.field final synthetic $holder:Lexpo/modules/kotlin/ModuleHolder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lexpo/modules/kotlin/ModuleHolder<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lexpo/modules/kotlin/ModuleHolder;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/kotlin/ModuleHolder<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/kotlin/ModuleRegistry$register$1$2;->$holder:Lexpo/modules/kotlin/ModuleHolder;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke()LR8/N;
    .locals 3

    .line 2
    invoke-static {}, LR8/d0;->a()LR8/J;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 3
    invoke-static {v1, v2, v1}, LR8/T0;->b(LR8/A0;ILjava/lang/Object;)LR8/z;

    move-result-object v1

    .line 4
    invoke-virtual {v0, v1}, Ln7/a;->X(Ln7/j;)Ln7/j;

    move-result-object v0

    .line 5
    new-instance v1, LR8/M;

    iget-object v2, p0, Lexpo/modules/kotlin/ModuleRegistry$register$1$2;->$holder:Lexpo/modules/kotlin/ModuleHolder;

    invoke-virtual {v2}, Lexpo/modules/kotlin/ModuleHolder;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, LR8/M;-><init>(Ljava/lang/String;)V

    .line 6
    invoke-interface {v0, v1}, Ln7/j;->X(Ln7/j;)Ln7/j;

    move-result-object v0

    .line 7
    invoke-static {v0}, LR8/O;->a(Ln7/j;)LR8/N;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lexpo/modules/kotlin/ModuleRegistry$register$1$2;->invoke()LR8/N;

    move-result-object v0

    return-object v0
.end method
