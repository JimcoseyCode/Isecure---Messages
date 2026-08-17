.class public final synthetic Lcom/facebook/react/g;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/bridge/Callback;


# instance fields
.field public final synthetic g:Lcom/facebook/react/ReactActivityDelegate;

.field public final synthetic h:I

.field public final synthetic i:[Ljava/lang/String;

.field public final synthetic j:[I


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/ReactActivityDelegate;I[Ljava/lang/String;[I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/g;->g:Lcom/facebook/react/ReactActivityDelegate;

    .line 5
    .line 6
    iput p2, p0, Lcom/facebook/react/g;->h:I

    .line 7
    .line 8
    iput-object p3, p0, Lcom/facebook/react/g;->i:[Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/facebook/react/g;->j:[I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke([Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/g;->g:Lcom/facebook/react/ReactActivityDelegate;

    .line 2
    .line 3
    iget v1, p0, Lcom/facebook/react/g;->h:I

    .line 4
    .line 5
    iget-object v2, p0, Lcom/facebook/react/g;->i:[Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/facebook/react/g;->j:[I

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3, p1}, Lcom/facebook/react/ReactActivityDelegate;->b(Lcom/facebook/react/ReactActivityDelegate;I[Ljava/lang/String;[I[Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
