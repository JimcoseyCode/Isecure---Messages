.class public final synthetic Lb7/b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lw7/a;


# direct methods
.method public synthetic constructor <init>(Lw7/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb7/b;->g:Lw7/a;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/b;->g:Lw7/a;

    .line 2
    .line 3
    invoke-static {v0}, Lexpo/modules/kotlin/runtime/WorkletRuntime;->a(Lw7/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
