.class public final synthetic Lexpo/modules/kotlin/c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/a;


# instance fields
.field public final synthetic g:Lexpo/modules/kotlin/AppContext;

.field public final synthetic h:Ljava/lang/ref/WeakReference;


# direct methods
.method public synthetic constructor <init>(Lexpo/modules/kotlin/AppContext;Ljava/lang/ref/WeakReference;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/kotlin/c;->g:Lexpo/modules/kotlin/AppContext;

    .line 5
    .line 6
    iput-object p2, p0, Lexpo/modules/kotlin/c;->h:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/c;->g:Lexpo/modules/kotlin/AppContext;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/kotlin/c;->h:Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lexpo/modules/kotlin/AppContext;->a(Lexpo/modules/kotlin/AppContext;Ljava/lang/ref/WeakReference;)Lexpo/modules/kotlin/runtime/WorkletRuntime;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
