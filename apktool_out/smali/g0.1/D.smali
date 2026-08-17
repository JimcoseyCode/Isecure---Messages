.class public final synthetic Lg0/D;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lg0/I;

.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(Lg0/I;ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg0/D;->g:Lg0/I;

    .line 5
    .line 6
    iput p2, p0, Lg0/D;->h:I

    .line 7
    .line 8
    iput-object p3, p0, Lg0/D;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lg0/D;->j:Ljava/lang/Throwable;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lg0/D;->g:Lg0/I;

    .line 2
    .line 3
    iget v1, p0, Lg0/D;->h:I

    .line 4
    .line 5
    iget-object v2, p0, Lg0/D;->i:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lg0/D;->j:Ljava/lang/Throwable;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Lg0/I;->l(Lg0/I;ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
