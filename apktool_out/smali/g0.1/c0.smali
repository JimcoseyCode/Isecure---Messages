.class public final synthetic Lg0/c0;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lg0/m;

.field public final synthetic h:Lg0/k;


# direct methods
.method public synthetic constructor <init>(Lg0/m;Lg0/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg0/c0;->g:Lg0/m;

    .line 5
    .line 6
    iput-object p2, p0, Lg0/c0;->h:Lg0/k;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg0/c0;->g:Lg0/m;

    .line 2
    .line 3
    iget-object v1, p0, Lg0/c0;->h:Lg0/k;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lg0/I$g;->c(Lg0/m;Lg0/k;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
