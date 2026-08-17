.class public final synthetic LF/P;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:LF/M;

.field public final synthetic h:Landroidx/lifecycle/B;


# direct methods
.method public synthetic constructor <init>(LF/M;Landroidx/lifecycle/B;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF/P;->g:LF/M;

    .line 5
    .line 6
    iput-object p2, p0, LF/P;->h:Landroidx/lifecycle/B;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LF/P;->g:LF/M;

    .line 2
    .line 3
    iget-object v1, p0, LF/P;->h:Landroidx/lifecycle/B;

    .line 4
    .line 5
    invoke-static {v0, v1}, LF/U;->d(LF/M;Landroidx/lifecycle/B;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
