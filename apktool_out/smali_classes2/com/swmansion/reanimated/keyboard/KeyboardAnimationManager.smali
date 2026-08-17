.class public Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final mKeyboard:Lcom/swmansion/reanimated/keyboard/Keyboard;

.field private final mListeners:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Integer;",
            "Lcom/swmansion/reanimated/keyboard/KeyboardWorkletWrapper;",
            ">;"
        }
    .end annotation
.end field

.field private mNextListenerId:I

.field private final mWindowsInsetsManager:Lcom/swmansion/reanimated/keyboard/WindowsInsetsManager;


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mNextListenerId:I

    .line 6
    .line 7
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mListeners:Ljava/util/concurrent/ConcurrentHashMap;

    .line 13
    .line 14
    new-instance v0, Lcom/swmansion/reanimated/keyboard/Keyboard;

    .line 15
    .line 16
    invoke-direct {v0}, Lcom/swmansion/reanimated/keyboard/Keyboard;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mKeyboard:Lcom/swmansion/reanimated/keyboard/Keyboard;

    .line 20
    .line 21
    new-instance v1, Lcom/swmansion/reanimated/keyboard/WindowsInsetsManager;

    .line 22
    .line 23
    new-instance v2, Lcom/swmansion/reanimated/keyboard/a;

    .line 24
    .line 25
    invoke-direct {v2, p0}, Lcom/swmansion/reanimated/keyboard/a;-><init>(Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, p1, v0, v2}, Lcom/swmansion/reanimated/keyboard/WindowsInsetsManager;-><init>(Ljava/lang/ref/WeakReference;Lcom/swmansion/reanimated/keyboard/Keyboard;Lcom/swmansion/reanimated/keyboard/NotifyAboutKeyboardChangeFunction;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mWindowsInsetsManager:Lcom/swmansion/reanimated/keyboard/WindowsInsetsManager;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public notifyAboutKeyboardChange()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mListeners:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lcom/swmansion/reanimated/keyboard/KeyboardWorkletWrapper;

    .line 22
    .line 23
    iget-object v2, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mKeyboard:Lcom/swmansion/reanimated/keyboard/Keyboard;

    .line 24
    .line 25
    invoke-virtual {v2}, Lcom/swmansion/reanimated/keyboard/Keyboard;->getState()Lcom/swmansion/reanimated/keyboard/KeyboardState;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2}, Lcom/swmansion/reanimated/keyboard/KeyboardState;->asInt()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    iget-object v3, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mKeyboard:Lcom/swmansion/reanimated/keyboard/Keyboard;

    .line 34
    .line 35
    invoke-virtual {v3}, Lcom/swmansion/reanimated/keyboard/Keyboard;->getHeight()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    invoke-virtual {v1, v2, v3}, Lcom/swmansion/reanimated/keyboard/KeyboardWorkletWrapper;->invoke(II)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    return-void
.end method

.method public subscribeForKeyboardUpdates(Lcom/swmansion/reanimated/keyboard/KeyboardWorkletWrapper;ZZ)I
    .locals 4

    .line 1
    iget v0, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mNextListenerId:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mNextListenerId:I

    .line 6
    .line 7
    iget-object v1, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mListeners:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    new-instance v1, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationCallback;

    .line 16
    .line 17
    iget-object v2, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mKeyboard:Lcom/swmansion/reanimated/keyboard/Keyboard;

    .line 18
    .line 19
    new-instance v3, Lcom/swmansion/reanimated/keyboard/a;

    .line 20
    .line 21
    invoke-direct {v3, p0}, Lcom/swmansion/reanimated/keyboard/a;-><init>(Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v1, v2, v3, p3}, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationCallback;-><init>(Lcom/swmansion/reanimated/keyboard/Keyboard;Lcom/swmansion/reanimated/keyboard/NotifyAboutKeyboardChangeFunction;Z)V

    .line 25
    .line 26
    .line 27
    iget-object v2, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mWindowsInsetsManager:Lcom/swmansion/reanimated/keyboard/WindowsInsetsManager;

    .line 28
    .line 29
    invoke-virtual {v2, v1, p2, p3}, Lcom/swmansion/reanimated/keyboard/WindowsInsetsManager;->startObservingChanges(Lcom/swmansion/reanimated/keyboard/KeyboardAnimationCallback;ZZ)V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object p2, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mListeners:Ljava/util/concurrent/ConcurrentHashMap;

    .line 33
    .line 34
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    invoke-virtual {p2, p3, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    return v0
.end method

.method public unsubscribeFromKeyboardUpdates(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mListeners:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mListeners:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->mWindowsInsetsManager:Lcom/swmansion/reanimated/keyboard/WindowsInsetsManager;

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/swmansion/reanimated/keyboard/WindowsInsetsManager;->stopObservingChanges()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method
